package systemdesign.lld.parkinglot.fee;

import systemdesign.lld.parkinglot.Ticket;

/**
 * @author amarnath-nitt 14/05/25
 */
public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
