 def start(){
     slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#439FE0', 
            message: "*STARTED* By ${currentBuild.getBuildCauses()[0].userId} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER}"
  }
 def success(){
   slackSend tteamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', 
            message: "*SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
  }
def fail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', 
              message: "*FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def testingfail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', 
              message: "*Testing-FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def stagingfail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', 
              message: "*Staging-FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def deployfail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', 
              message: "*Deploy-FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}

def testing() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', 
              message: "*Testing-SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def staging() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', 
              message: "*Staging-SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def deploy() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', 
              message: "*Deploy-SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
