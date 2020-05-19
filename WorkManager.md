## WorkManager

- *Deferrable* （**延期性**）means that the work is not required to run immediately. For example, sending analytical data to the server or syncing the database in the background is work that can be deferred.

- *Guaranteed execution*（**保证执行性**） means that the task will run even if the app exits or the device restarts.

  **Note:**

  - `WorkManager` is not intended for in-process background work that can be terminated safely if the app process is killed.
  - `WorkManager` is not intended for tasks that require immediate execution.



- [`Worker`](https://developer.android.com/reference/androidx/work/Worker.html)
  This class is where you define the actual work (the task) to run in the background. You extend this class and override the [`doWork()`](https://developer.android.com/reference/androidx/work/Worker.html#doWork()) method. The `doWork()` method is where you put code to be performed in the background, such as syncing data with the server or processing images.
- [`WorkRequest`](https://developer.android.com/reference/androidx/work/WorkRequest.html)
  This class represents a request to run the worker in background. Use `WorkRequest` to configure how and when to run the worker task, with the help of [`Constraints`](https://developer.android.com/reference/androidx/work/Constraints.html) such as device plugged in or Wi-Fi connected. 
- [`WorkManager`](https://developer.android.com/reference/androidx/work/WorkManager.html)
  This class schedules and runs your `WorkRequest`. `WorkManager` schedules work requests in a way that spreads out the load on system resources, while honoring the constraints that you specify. 