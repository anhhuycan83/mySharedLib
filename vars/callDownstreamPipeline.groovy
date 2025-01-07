import org.example.PipelineUtils

/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(String repoName) {
    echo 'callDownstreamPipeline.groovy'
    PipelineUtils.callDownstreamPipeline(repoName)
}
