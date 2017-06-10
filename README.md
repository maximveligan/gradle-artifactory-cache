# Summary

This is an experiment to see if artifactory can also handle the gradle build cache. 

# Description

I am writing a plugin for gradle to use artifactory as a remote build cache to store all cacheable outputs. For more information on the gradle build cache: https://docs.gradle.org/3.5/userguide/build_cache.html

## Why artifactory?

Artifactory is used by many companies in many build pipelines, due to it having multiple mirrors, providing quick downloads for people regardless of location. This plugin will take advantage of the widespread use of artifactory and its mirror links to create a remote build cache that will allow all developers working on a project to download gradle task output, rather than regenerating it from source each time. For more information on the gradle build cache: https://www.jfrog.com/open-source/
