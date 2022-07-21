
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
				checkout_git.checkout_git()
				       }
            }
                
            }
        }
        stage('Maven Build') {
            steps {
                script 
                {
                    dir("dir1") {maven_build.maven_build()}
                }
            }
        
    }                
        
