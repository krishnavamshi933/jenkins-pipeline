def checkout_git() {
    
    echo "This is for checking out git code."
   git credentialsId: 'krishnavamshi933', url: "git@github.com:krishnavamshi933/${}.git"

}

return this