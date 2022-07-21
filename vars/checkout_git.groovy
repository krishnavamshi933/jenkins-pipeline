def checkout_git() {
    
    echo "This is for checking out git code."
   git branch: 'main', credentialsId: 'krishnavamshi933', url: "git@github.com:krishnavamshi933/java-hello-world-with-maven.git", branch: "master"

}

return this