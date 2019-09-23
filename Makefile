.PHONY: build serve gh-pages

build:
	sbt makeMicrosite

serve:
	cd target/site/ && jekyll serve

gh-pages:
	cd target/site && \
	rm -rf .git && \
	git init && \
	git add . && \
	git commit -am "Update website" && \
	git push -f git@github.com:epfl-lara/stainless-site.git master:gh-pages
