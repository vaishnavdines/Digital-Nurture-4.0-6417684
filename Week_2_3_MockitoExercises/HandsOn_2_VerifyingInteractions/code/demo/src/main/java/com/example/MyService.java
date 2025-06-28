package Week_2_3_MockitoExercises.HandsOn_2_VerifyingInteractions.code.demo.src.main.java.com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();
    }
}

