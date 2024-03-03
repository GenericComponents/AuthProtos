API_NAME := auth

all: generate documentation

generate:
	rm -rf ./src
	mkdir -p ./src/main/java
	
	docker stop $(API_NAME) || true
	docker rm $(API_NAME) || true
	docker build --rm -t $(API_NAME)-build .
	docker run --name=$(API_NAME) $(API_NAME)-build:latest ls
	docker cp $(API_NAME):proto/src .

documentation:
	rm -rf ./docs/
	mkdir -p ./docs

	docker pull pseudomuto/protoc-gen-doc
	docker run --rm -v $(CURDIR)/docs:/out -v $(CURDIR)/protos:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,$(API_NAME).md

