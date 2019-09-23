.PHONY: build serve gh-pages

build:
	sbt makeMicrosite

serve:
	cd target/site/ && jekyll serve

gh-pages:
	cd target/site && \
	git init && \
	git checkout -f gh-pages && \
	git add . && \
	git commit -am "Update website" && \
	git push git@github.com:epfl-lara/stainless-site.git master:gh-pages
