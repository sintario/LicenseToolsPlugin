package com.cookpad.android.plugin.license

open class LicenseToolsPluginExtension {
    var outputHtml: String = "licenses.html"

    var outputJson: String = "licenses.json"

    var licensesYaml: String = "licenses.yml"

    var ignoredGroups = emptySet<String>()

    var ignoredProjects = emptySet<String>()

    companion object {
        const val NAME = "licenseTools"
    }
}
