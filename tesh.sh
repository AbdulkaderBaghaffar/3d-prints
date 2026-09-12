#!/usr/bin/env bash
BASE=http://localhost:8080
JSON='Content-Type: application/json'
B() { curl -s -w "\n→ %{http_code}\n" "$@"; }

echo "1) POST /materials"
B -X POST $BASE/materials -H "$JSON" -d '{"name":"PLA","costPerGram":0.05}'

echo "2) POST /uploads"
B -X POST $BASE/uploads -H "$JSON" -d '{"filename":"benchy.stl","materialId":1}'

echo "3) GET /materials"
B $BASE/materials

echo "4) GET /uploads"
B $BASE/uploads
