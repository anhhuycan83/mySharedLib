#!/usr/bin/env groovy
import org.example.pipelineUtils

/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(String repoName) {
    // sh("echo 'callDownstreamPipeline.groovy'")
    pipelineUtils.callDownstreamPipeline(repoName)
}
