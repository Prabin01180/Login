package com.example.prabinpc.login;

public class ProjectsActivity {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();
    GitHubService service = retrofit.create(GitHubService.class);

}
