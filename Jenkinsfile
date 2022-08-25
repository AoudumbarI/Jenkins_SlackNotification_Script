@Library('sclak_library') _


    node {
            try {
        lib.start()

        stage('Prepare code') {
            echo 'do checkout stuff'
        }

        stage('Testing') {
            echo 'Testing'
            echo 'Testing - publish coverage results'
        }

        stage('Staging') {
            echo 'Deploy Stage'
        }

        stage('Deploy') {
            echo 'Deploy - Backend'
            echo 'Deploy - Frontend'
        }
        // stage('sh'){
        //     sh './jenkins/scripts/deliver.sh'
        // }
        
        lib.success()
        }
    }

   catch (err) {
       
     lib.fail()
        
    throw err
  } 
