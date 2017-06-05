# Summary

This is an experiment to see if artifactory can also handle the gradle build cache. 

# Description

I am writing a plugin for gradle to use artifactory as a remote build cache to store all cacheable outputs. 

## Why artifactory?

Artifactory is used by many companies, due to it having multiple mirrors, providing quick downloads for people regardless of location. This plugin will take advantage of the widespread use of artifactory and its mirror links to create a remote build cache that will allow all developers working on a project to download bytecode, rather than regenerating it from source each time.
