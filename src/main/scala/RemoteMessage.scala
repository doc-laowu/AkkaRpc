trait RemoteMessage extends Serializable

case class RegisterWorker(val id: String, val workerHost: String, val memory:Int, val cores:Int)

case class WorkerInfo(val id: String, val workerHost: String,
                      val memory:Int, val cores:Int, var lastHeartbeat: Long = System.currentTimeMillis())

case class RegisteredWorker(val workerHost: String)

case class HeartBeat(val id: String)

case class CheckOfTimeOutWorker()

case class SendHeartBeat()