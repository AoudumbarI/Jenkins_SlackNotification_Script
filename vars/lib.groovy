 def start(){
     slackSend teamDomain: "techverito", channel: "#gocd-build-notifications" , tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#439FE0', 
            message: "*STARTED* By ${currentBuild.getBuildCauses()[0].userId} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER}"
  }
 def success(){
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#00FF00', 
            message: "*SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
  }
def fail() {
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#FF0000', 
              message: "*FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def testingfail() {
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#FF0000', 
              message: "*Testing-FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def stagingfail() {
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#FF0000', 
              message: "*Staging-FAILURE* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}

def testing() {
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#00FF00', 
              message: "*Testing-SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def staging() {
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#00FF00', 
              message: "*Staging-SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
def deploy() {
   slackSend teamDomain: "techverito", channel: "#gocd-build-notifications", tokenCredentialId: "32065985-0e36-4265-bdd8-8fc1e942f4f4", color: '#00FF00', 
              message: "*Deploy-SUCCESS* after ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
}
