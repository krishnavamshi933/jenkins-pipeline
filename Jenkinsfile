@Library('MyLibrary') _
pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        
        stage('Hello World') {
            steps {
                script 
                {
                    hello.hello()
                }
            }
        }

        stage('Checkout code from Git') {
            steps {
                
                script {
				checkout_git.checkout_git("jb-hello-world-maven")
				       }
                
                
            }
        }
        
        
    }                
        
    }
    
