package systemdesign.lld.parkinglot.fee;

import systemdesign.lld.parkinglot.Ticket;

/**
 * @author amarnath-nitt 14/05/25
 */
public class FlatFeeStrategy implements FeeStrategy {
    private final double RATE_PER_HOUR = 10.0;

    @Override
    public double calculateFee(Ticket ticket) {
        long parkedDuration = ticket.getExitTime().getTime() - ticket.getEntryTime().getTime();
        double fee = (parkedDuration / 60.0) * RATE_PER_HOUR;
        return Math.max(fee, 0);
    }
}
