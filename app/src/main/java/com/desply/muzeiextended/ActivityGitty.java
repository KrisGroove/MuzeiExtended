package com.desply.muzeiextended;

import android.os.Bundle;

import com.github.paolorotolo.gitty_reporter.GittyReporter;

public class ActivityGitty extends GittyReporter {

    // Please DO NOT override onCreate. Use init instead.
    @Override
    public void init(Bundle savedInstanceState) {

        // Set where Gitty will send issues.
        // (username, repository name);
        setTargetRepository("KrisGroove", "Muzei-Extended");

        // Set Auth token to open issues if user doesn't have a GitHub account
        // For example, you can register a bot account on GitHub that will open bugs for you.
        //setGuestOAuth2Token("28f479f73db97d912611b27579aad7a76ad2baf5");


        // OPTIONAL METHODS

        // Set if User can send bugs with his own GitHub account (default: true)
        // If false, Gitty will always use your Auth token
        enableUserGitHubLogin(true);

        // Set if Gitty can use your Auth token for users without a GitHub account (default: true)
        // If false, Gitty will redirect non registred users to github.com/join
        enableGuestGitHubLogin(false);

        // Include other relevant info in your bug report (like custom variables).
        setExtraInfo("");
    }
}