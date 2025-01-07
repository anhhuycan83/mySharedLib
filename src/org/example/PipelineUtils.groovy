package org.example

/* groovylint-disable-next-line ClassJavadoc, CompileStatic */
class pipelineUtils {

    static void callDownstreamPipeline(String repoName) {
        // echo 'PipelineUtils.groovy'
        echo "Triggering downstream pipeline for repository: ${repoName}"
        build job: repoName, wait: true
    }

}
