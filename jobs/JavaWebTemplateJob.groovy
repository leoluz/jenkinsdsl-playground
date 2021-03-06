def jobName = 'JavaWebTemplateBuild'
def repoUrl = 'leoluz/java-web-template'
job(jobName) {
    scm {
        github(repoUrl)
    }
    steps {
        shell('echo Job ${jobName}: This is step 1!')
        parameters {
            stringParam('jobName', jobName, 'The job name')
        }
        triggers {
            cron('H/1 * * * *')
        }
        maven {
            goals('clean')
            goals('package')
        }
    }
}
