@Library('sclak_library') _


    node {
            try {
        lib.start()

        stage('Prepare code') {
            echo 'do checkout stuff'
            // sh './jenkins/scripts/deliver.sh'
        }

        stage('Testing') {
            echo 'Testing'
            echo 'Testing - publish coverage results'
            // sh './jenkins/scripts/deliver.sh'
        }
        lib.testing()

        stage('Staging') {
            echo 'Deploy Stage'
            sh './jenkins/scripts/deliver.sh'
        }
        lib.staging()

        stage('Deploy') {
            echo 'Deploy - Backend'
            echo 'Deploy - Frontend'
            // sh './jenkins/scripts/deliver.sh'
        }
        lib.deploy()
        
        }catch (err) {
       
        lib.fail()
        
        throw err
        }
        lib.success()
    } 

