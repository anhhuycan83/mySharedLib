import org.example.PipelineUtils

/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(String repoName) {
    sh("echo 'callDownstreamPipeline.groovy'")
    PipelineUtils.callDownstreamPipeline(repoName)
}
