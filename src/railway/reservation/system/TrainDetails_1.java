/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "train_details", catalog = "userdetails", schema = "")
@NamedQueries({
    @NamedQuery(name = "TrainDetails_1.findAll", query = "SELECT t FROM TrainDetails_1 t")
    , @NamedQuery(name = "TrainDetails_1.findById", query = "SELECT t FROM TrainDetails_1 t WHERE t.id = :id")
    , @NamedQuery(name = "TrainDetails_1.findByTrainNo", query = "SELECT t FROM TrainDetails_1 t WHERE t.trainNo = :trainNo")
    , @NamedQuery(name = "TrainDetails_1.findByTrainName", query = "SELECT t FROM TrainDetails_1 t WHERE t.trainName = :trainName")
    , @NamedQuery(name = "TrainDetails_1.findBySource", query = "SELECT t FROM TrainDetails_1 t WHERE t.source = :source")
    , @NamedQuery(name = "TrainDetails_1.findByDest", query = "SELECT t FROM TrainDetails_1 t WHERE t.dest = :dest")
    , @NamedQuery(name = "TrainDetails_1.findByDate", query = "SELECT t FROM TrainDetails_1 t WHERE t.date = :date")
    , @NamedQuery(name = "TrainDetails_1.findBySpace", query = "SELECT t FROM TrainDetails_1 t WHERE t.space = :space")
    , @NamedQuery(name = "TrainDetails_1.findByTime", query = "SELECT t FROM TrainDetails_1 t WHERE t.time = :time")
    , @NamedQuery(name = "TrainDetails_1.findBySleeper", query = "SELECT t FROM TrainDetails_1 t WHERE t.sleeper = :sleeper")
    , @NamedQuery(name = "TrainDetails_1.findByNonsleeper", query = "SELECT t FROM TrainDetails_1 t WHERE t.nonsleeper = :nonsleeper")
    , @NamedQuery(name = "TrainDetails_1.findByAc", query = "SELECT t FROM TrainDetails_1 t WHERE t.ac = :ac")})
public class TrainDetails_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "train_no")
    private int trainNo;
    @Basic(optional = false)
    @Column(name = "train_name")
    private String trainName;
    @Basic(optional = false)
    @Column(name = "source")
    private String source;
    @Basic(optional = false)
    @Column(name = "dest")
    private String dest;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "space")
    private int space;
    @Basic(optional = false)
    @Column(name = "time")
    private String time;
    @Basic(optional = false)
    @Column(name = "sleeper")
    private String sleeper;
    @Basic(optional = false)
    @Column(name = "nonsleeper")
    private String nonsleeper;
    @Basic(optional = false)
    @Column(name = "ac")
    private String ac;

    public TrainDetails_1() {
    }

    public TrainDetails_1(Integer id) {
        this.id = id;
    }

    public TrainDetails_1(Integer id, int trainNo, String trainName, String source, String dest, Date date, int space, String time, int fare, String sleeper, String nonsleeper, String ac) {
        this.id = id;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.dest = dest;
        this.date = date;
        this.space = space;
        this.time = time;
        this.sleeper = sleeper;
        this.nonsleeper = nonsleeper;
        this.ac = ac;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        int oldTrainNo = this.trainNo;
        this.trainNo = trainNo;
        changeSupport.firePropertyChange("trainNo", oldTrainNo, trainNo);
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        String oldTrainName = this.trainName;
        this.trainName = trainName;
        changeSupport.firePropertyChange("trainName", oldTrainName, trainName);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        String oldSource = this.source;
        this.source = source;
        changeSupport.firePropertyChange("source", oldSource, source);
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        String oldDest = this.dest;
        this.dest = dest;
        changeSupport.firePropertyChange("dest", oldDest, dest);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        int oldSpace = this.space;
        this.space = space;
        changeSupport.firePropertyChange("space", oldSpace, space);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

   
    public String getSleeper() {
        return sleeper;
    }

    public void setSleeper(String sleeper) {
        String oldSleeper = this.sleeper;
        this.sleeper = sleeper;
        changeSupport.firePropertyChange("sleeper", oldSleeper, sleeper);
    }

    public String getNonsleeper() {
        return nonsleeper;
    }

    public void setNonsleeper(String nonsleeper) {
        String oldNonsleeper = this.nonsleeper;
        this.nonsleeper = nonsleeper;
        changeSupport.firePropertyChange("nonsleeper", oldNonsleeper, nonsleeper);
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        String oldAc = this.ac;
        this.ac = ac;
        changeSupport.firePropertyChange("ac", oldAc, ac);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrainDetails_1)) {
            return false;
        }
        TrainDetails_1 other = (TrainDetails_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "railway.reservation.system.TrainDetails_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
