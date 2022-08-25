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
        }catch (err) {
       
        lib.testingfail()
        
        throw err
        }
        
        try {
        stage('Staging') {
            echo 'Deploy Stage'
            // sh './jenkins/scripts/deliver.sh'
        }
        lib.staging()
        }catch (err) {
       
        lib.stagingfail()
        
        throw err
        }
        try {
        stage('Deploy') {
            echo 'Deploy - Backend'
            echo 'Deploy - Frontend'
            sh './jenkins/scripts/deliver.sh'
        }
        lib.deploy()
        
        }catch (err) {
       
        lib.deployfail()
        
        throw err
        }
        lib.success()
    } 

