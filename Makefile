.PHONY: all serve

all:
	sbt makeMicrosite

serve:
	cd target/site/
	jekyll serve
	open 'http://127.0.0.1:4000'
