#!/usr/bin/env groovy
package org.example

/* groovylint-disable-next-line ClassJavadoc, ClassName, ClassNameSameAsFilename, CompileStatic */
class PipelineUtils {

    void callDownstreamPipeline(String repoName) {
        echo 'PipelineUtils.groovy'
        echo "Triggering downstream pipeline for repository: ${repoName}"
        build job: repoName, wait: true
    }

}
