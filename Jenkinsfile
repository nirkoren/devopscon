node {
    def mvnHome

    stage("Preparation") { 
        println "Cloning git repository..."
        mvnHome = tool 'M3'
		checkout scm
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
