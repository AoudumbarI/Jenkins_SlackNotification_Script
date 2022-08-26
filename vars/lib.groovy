

def summery(){   
      def summery = " ${currentBuild.durationString.minus(' and counting')} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER} By ${currentBuild.getBuildCauses()[0].userId} "
          message: summery
}
 
def start(){
     slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#439FE0', 
            message:"*STARTED* By ${currentBuild.getBuildCauses()[0].userId} <${env.BUILD_URL}/console | ${env.JOB_NAME}> - #${env.BUILD_NUMBER}"
}

def success(){
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', message: "*SUCCESS* after ${summery()}"
}

def fail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', message: "*FAILURE* after ${summery()} "
}

def testing() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', message: "*Testing-SUCCESS* after ${summery()} "
}

def staging() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', message: "*Staging-SUCCESS* after ${summery()} "
}

def deploy() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#00FF00', message: "*Deploy-SUCCESS* after ${summery()} "
}

def testingfail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', message: "*Testing-FAILURE* after ${summery()}"
}

def stagingfail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', message: "*Staging-FAILURE* after ${summery()} "
}

def deployfail() {
   slackSend teamDomain: "${env.TEAMDOMAIN}", channel: "${env.CHANNEL}", tokenCredentialId: "${env.TOKENCREDENTIALID}", color: '#FF0000', message: "*Deploy-FAILURE* after ${summery()} "
}

