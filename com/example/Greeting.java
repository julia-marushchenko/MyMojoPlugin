/**
 * Java program to create plugin of writing log with greeting.
 */
package com.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Greeting class.
 */
@Mojo(name = "sayhello")
public class Greeting extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException {

        // Writing logs.
        getLog().info("Hello world.");

    }

}