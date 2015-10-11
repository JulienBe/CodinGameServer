package servers

import clients.Client

/**
 * Created by julien on 06/10/15.
 */
class Rift extends Server {

  override var clients: List[Client] = _
  var numberOfPlayers = clients.length

  override def isFinished: Boolean = ???

  override def init: Unit = {

  }

  override def act: Unit = ???
  override def end: Unit = ???

}
