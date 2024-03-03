FROM rvolosatovs/protoc:4.1
ENTRYPOINT [ ]

WORKDIR /proto
COPY . .

RUN mkdir -p src/main/java
RUN protoc --java_out=src/main/java --grpc-java_out=src/main/java --proto_path=protos protos/*.proto
