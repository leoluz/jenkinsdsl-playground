def jobName = 'JavaWebTemplateBuild'
def repoUrl = 'https://github.com/leoluz/java-web-template.git'
job(jobName) {
    scm {
        github(repoUrl)
    }
    steps {
        shell('echo Job ${jobName}: This is step 1!')
        maven {
            goals('clean')
            goals('package')
        }
    }
}
