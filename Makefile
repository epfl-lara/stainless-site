.PHONY: build serve

build:
	sbt makeMicrosite

serve:
	cd target/site/ && jekyll serve
