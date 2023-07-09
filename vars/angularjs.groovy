
def call(){
    
    node(){
        env.APP_TYPE="angularjs"
        common.lintChecks()
        env.ARGS="-Dsonar.sources=."              
        common.sonarChecks()
        common.testCases()
        if(env.TAG_NAME != null) {
            common.artifacts()

    }
    
}


/*
def lintChecks(){
    sh ''' 
        echo Installing AngularLint for ${COMPONENT}
        echo lint checks completed for ${COMPONENT}

    ''' 
}


def call(COMPONENT) {
    pipeline {
        agent {  label 'WS' }
        stages {      

            stage('Lint Checks') {
                steps { 
                    script {
                        lintChecks()
                    }
                }
            }

            stage('Code Quality Analysis') {
                steps {   

                        sh "echo Code Quality Analysis Is In Place"
                }
            }

        }                                                                             
    }
}

*/