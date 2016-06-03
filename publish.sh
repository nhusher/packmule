#!/bin/bash
set -euo pipefail

docker build -t nhusher/packmule .
docker push nhusher/packmule
