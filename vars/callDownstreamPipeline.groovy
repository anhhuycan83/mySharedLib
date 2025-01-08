#!/usr/bin/env groovy
import org.example.PipelineUtils

/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(script, String repoName) {
    // sh("echo 'callDownstreamPipeline.groovy'")
    // def myUtil = new PipelineUtils()
    echo 'callDownstreamPipeline.groovy'
    PipelineUtils.callDownstreamPipeline(script, repoName)
}
