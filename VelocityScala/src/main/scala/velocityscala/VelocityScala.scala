package velocityscala

import com.google.inject.Inject
import com.velocitypowered.api.proxy.ProxyServer
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.event.Subscribe
import org.slf4j.Logger

class VelocityScala @Inject() (server: ProxyServer, logger: Logger) {
  logger.info("This works?")

  @Subscribe
  def onProxyInitialization(event: ProxyInitializeEvent) =
    logger.info("We initialized!")   
}