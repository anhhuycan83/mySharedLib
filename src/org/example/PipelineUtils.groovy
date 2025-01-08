#!/usr/bin/env groovy
package org.example

/* groovylint-disable-next-line ClassJavadoc, ClassName, ClassNameSameAsFilename, CompileStatic */
class PipelineUtils {

    static void callDownstreamPipeline(script, String repoName) {
        script.echo 'PipelineUtils.groovy'
        script.echo "Triggering downstream pipeline for repository: ${repoName}"
        script.build(job: repoName, wait: true)
    }

}
