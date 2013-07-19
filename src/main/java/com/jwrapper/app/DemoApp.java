package com.jwrapper.app;

import javax.swing.JOptionPane;

import jwrapper.jwutils.JWSystem;

public class DemoApp {

	public static void main(final String[] args) {

		String myJwVersion;

		try {
			// App is running from JWrapper, so has access to JW APIs
			myJwVersion = JWSystem.getAppBundleVersion();
		} catch (final Exception x) {
			// App is running outside of JWrapper
			myJwVersion = "(not running inside JWrapper)";
		}

		JOptionPane.showMessageDialog(null, "Minimal App (Hello World) "
				+ myJwVersion);

		System.exit(0);

	}

}
