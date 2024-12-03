API_NAME := auth

all: generate documentation

generate:
	rm -rf ./src
	mkdir -p ./src/main/java

	docker pull rvolosatovs/protoc
	docker run --rm -v $(CURDIR)/src/main/java:/out -v $(CURDIR)/protos:/protos rvolosatovs/protoc --proto_path=/protos --java_out=/out entity.proto service.proto

documentation:
	rm -rf ./docs/
	mkdir -p ./docs

	docker pull pseudomuto/protoc-gen-doc
	docker run --rm -v $(CURDIR)/docs:/out -v $(CURDIR)/protos:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,$(API_NAME).md
