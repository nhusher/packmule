FROM java:alpine

# Leiningen
ENV LEIN_ROOT 1
RUN apk -U add bash curl && \
    curl -L -s https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein > \
    /usr/local/bin/lein && \
    chmod 0755 /usr/local/bin/lein && \
    lein upgrade

ADD ./project.clj ./
RUN lein deps

ADD ./run.sh ./
ADD ./src ./src

# Make leiningen's REPL accessible via port 47480
ENV LEIN_REPL_HOST "0.0.0.0"
ENV LEIN_REPL_PORT 47480
EXPOSE 47480

CMD ./run.sh