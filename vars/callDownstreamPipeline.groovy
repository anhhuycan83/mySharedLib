#!/usr/bin/env groovy
import org.example.PipelineUtils

/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(String repoName) {
    // sh("echo 'callDownstreamPipeline.groovy'")
    def myUtil = new PipelineUtils()
    myUtil.callDownstreamPipeline(repoName)
}
