package servers

import clients.Client

abstract class Server() {

  var clients: List[Client]

  def start() = {
    init
    while (!isFinished)
      act
    end
  }

  def init
  def act
  def end

  def isFinished: Boolean
}