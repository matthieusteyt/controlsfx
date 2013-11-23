package org.controlsfx;

import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import fxsampler.SampleBase;

public abstract class ControlsFXSample extends SampleBase {

	private static final ProjectInfo projectInfo = new ProjectInfo();
	
	@Override
	public String getProjectName() {
		return "ControlsFX";
	}

	@Override
	public String getProjectVersion() {
		return projectInfo.getVersion();
	}
	
	private static class ProjectInfo {
		
		private String version;
		
		
		public ProjectInfo() {
			
			InputStream s = getClass().getClassLoader().getResourceAsStream(
					"META-INF/manifest.mf");
			
			try {
				Manifest manifest = new Manifest(s);
				Attributes attr = manifest.getMainAttributes();
				version = attr.getValue("Implementation-Version");
			} catch (Throwable e) {
				e.printStackTrace();
				version = "???";
			}
		}
		
		public String getVersion() {
			return version;
		}
	}

}
