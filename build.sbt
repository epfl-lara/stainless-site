
lazy val site = project
  .in(file("."))
  .enablePlugins(MicrositesPlugin)
  .settings(
    name                 := "Stainless website",
    organizationName     := "EPFL-LARA",
    organizationHomepage := Some(url("https://lara.epfl.ch/w/")),

    micrositeName              := "Stainless",
    micrositeDescription       := "Formal Verification for Scala",

    micrositeUrl               := "https://stainless.epfl.ch",
    micrositeBaseUrl           := "",

    // micrositeUrl               := "https://romac.me",
    // micrositeBaseUrl           := "/stainless-microsite",

    micrositeGithubOwner       := "epfl-lara",
    micrositeGithubRepo        := "stainless",
    micrositeShareOnSocial     := false,
    micrositeDocumentationUrl  := "https://epfl-lara.github.io/stainless/",
    micrositeCompilingDocsTool := WithMdoc,

    mdocIn := baseDirectory.value / "content",

    micrositeJsDirectory               := baseDirectory.value / "js",
    micrositeCssDirectory              := baseDirectory.value / "css",
    micrositeImgDirectory              := baseDirectory.value / "images",
    micrositeDataDirectory             := baseDirectory.value / "data",
    micrositeStaticDirectory           := baseDirectory.value / "static",
    micrositeExternalLayoutsDirectory  := baseDirectory.value / "layouts",
    micrositeExternalIncludesDirectory := baseDirectory.value / "includes",

    micrositePalette := Map(
      "brand-primary"   -> "rgb(188, 34, 28)",
      "brand-secondary" -> "#2F4F4F",
      "brand-tertiary"  -> "#345858",
      "gray-dark"       -> "#453E46",
      "gray"            -> "#837F84",
      "gray-light"      -> "#E3E2E3",
      "gray-lighter"    -> "#F4F3F4",
      "white-color"     -> "#FFFFFF",
    )
  )

