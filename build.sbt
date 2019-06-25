
lazy val site = project
  .in(file("."))
  .enablePlugins(MicrositesPlugin)
  .settings(
    name                 := "Stainless website",
    organizationName     := "EPFL-LARA",
    organizationHomepage := Some(url("https://lara.epfl.ch/w/")),

    micrositeName              := "Stainless",
    micrositeDescription       := "Verification framework and tool for higher-order Scala programs",
    micrositeUrl               := "https://stainless.epfl.ch",
    micrositeGithubOwner       := "epfl-lara",
    micrositeGithubRepo        := "stainless",
    micrositeShareOnSocial     := false,
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
      "brand-primary"     -> "#E05236",
      "brand-secondary"   -> "#3F3242",
      "brand-tertiary"    -> "#2D232F",
      "gray-dark"         -> "#453E46",
      "gray"              -> "#837F84",
      "gray-light"        -> "#E3E2E3",
      "gray-lighter"      -> "#F4F3F4",
      "white-color"       -> "#FFFFFF",
    )
  )
