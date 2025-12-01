node {
    def mvnHome
    def GIT_REPO = "https://github.com/maximearin/devopscon.git"

    stage("Preparation") { 
        println "Cloning git repository..."
        git branch: "main", url: GIT_REPO
        mvnHome = tool 'Maven local'
    }

    stage('Build & Deploy') {
        def buildCMD = "${mvnHome}/bin/mvn clean install -Pci"
        println "Starting build..."
        if (isUnix()) {
            sh buildCMD
        } else {
            bat(buildCMD)
        }
        
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
    }
}
