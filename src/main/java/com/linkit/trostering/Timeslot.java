package com.linkit.trostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

/**
 * TODO Remove @XStreamConverter for java.time attributes once converters are provided by XStream out of the box.
 *
 * @see <a href="https://github.com/x-stream/xstream/issues/75">XStream#75</a>
 */
@com.thoughtworks.xstream.annotations.XStreamAlias("OrarioTurno")
public class Timeslot extends AbstractPersistable {

    static final long serialVersionUID = 1L;

    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    private java.time.LocalDateTime startTime;
    @com.thoughtworks.xstream.annotations.XStreamConverter(org.kie.soup.commons.xstream.LocalDateTimeXStreamConverter.class)
    private java.time.LocalDateTime endTime;

    public Timeslot() {
    }

    public java.time.LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime( java.time.LocalDateTime startTime ) {
        this.startTime = startTime;
    }

    public java.time.LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime( java.time.LocalDateTime endTime ) {
        this.endTime = endTime;
    }

    public Timeslot(
                     java.time.LocalDateTime startTime,
                     java.time.LocalDateTime endTime ) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

}