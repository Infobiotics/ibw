package roadblock.datapopulation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.BooleanOperator;
import roadblock.emf.ibl.Ibl.ConcentrationUnit;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.IProbabilityConstraint;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.IStateFormula;
import roadblock.emf.ibl.Ibl.ITimeConstraint;
import roadblock.emf.ibl.Ibl.IblFactory;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.RelationalOperator;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.TemporalOperator;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeUnit;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.xtext.ibl.ibl.ConcentrationConstraint;
import roadblock.xtext.ibl.ibl.ConcentrationQuantity;
import roadblock.xtext.ibl.ibl.ProbabilityConstraint;
import roadblock.xtext.ibl.ibl.ProbabilityProperty;
import roadblock.xtext.ibl.ibl.PropertyDefinition;
import roadblock.xtext.ibl.ibl.RewardProperty;
import roadblock.xtext.ibl.ibl.RewardTimeInstant;
import roadblock.xtext.ibl.ibl.StateExpression;
import roadblock.xtext.ibl.ibl.StateFormula;
import roadblock.xtext.ibl.ibl.TimeInterval;
import roadblock.xtext.ibl.ibl.VariableAssignmentObject;
import roadblock.xtext.ibl.ibl.util.IblSwitch;

@SuppressWarnings("all")
public class PropertyBuilder extends IblSwitch<Object> {
  private IblFactory modelFactory = IblFactory.eINSTANCE;
  
  public IProperty build(final PropertyDefinition propertyDefinition) {
    Object _doSwitch = this.doSwitch(propertyDefinition);
    return ((IProperty) _doSwitch);
  }
  
  public Object casePropertyDefinition(final PropertyDefinition property) {
    EObject _property = property.getProperty();
    return this.doSwitch(_property);
  }
  
  public Object caseProbabilityProperty(final ProbabilityProperty probabilityProperty) {
    IProperty property = ((IProperty) null);
    StateFormula _stateFormula1 = probabilityProperty.getStateFormula1();
    Object _doSwitch = this.doSwitch(_stateFormula1);
    IStateFormula leftStateFormula = ((IStateFormula) _doSwitch);
    boolean _isIsAlways = probabilityProperty.isIsAlways();
    if (_isIsAlways) {
      UnaryProbabilityProperty unaryProperty = this.modelFactory.createUnaryProbabilityProperty();
      unaryProperty.setOperator(TemporalOperator.ALWAYS);
      property = unaryProperty;
    } else {
      boolean _isIsEventually = probabilityProperty.isIsEventually();
      if (_isIsEventually) {
        UnaryProbabilityProperty unaryProperty_1 = this.modelFactory.createUnaryProbabilityProperty();
        unaryProperty_1.setOperator(TemporalOperator.EVENTUALLY);
        property = unaryProperty_1;
      } else {
        boolean _isIsNever = probabilityProperty.isIsNever();
        if (_isIsNever) {
          UnaryProbabilityProperty unaryProperty_2 = this.modelFactory.createUnaryProbabilityProperty();
          unaryProperty_2.setOperator(TemporalOperator.NOT_EVENTUALLY);
          property = unaryProperty_2;
        } else {
          boolean _isIsInfinitelyOften = probabilityProperty.isIsInfinitelyOften();
          if (_isIsInfinitelyOften) {
            UnaryProbabilityProperty unaryProperty_3 = this.modelFactory.createUnaryProbabilityProperty();
            unaryProperty_3.setOperator(TemporalOperator.ALWAYS_EVENTUALLY);
            property = unaryProperty_3;
          } else {
            boolean _isIsUntilThen = probabilityProperty.isIsUntilThen();
            if (_isIsUntilThen) {
              BinaryProbabilityProperty binaryProperty = this.modelFactory.createBinaryProbabilityProperty();
              binaryProperty.setOperator(TemporalOperator.UNTIL);
              property = binaryProperty;
            } else {
              boolean _isIsFollowedBy = probabilityProperty.isIsFollowedBy();
              if (_isIsFollowedBy) {
                BinaryProbabilityProperty binaryProperty_1 = this.modelFactory.createBinaryProbabilityProperty();
                binaryProperty_1.setOperator(TemporalOperator.WEAK_UNTIL);
                property = binaryProperty_1;
              } else {
                boolean _isIsSteadyState = probabilityProperty.isIsSteadyState();
                if (_isIsSteadyState) {
                  SteadyStateProperty steadyStateProperty = this.modelFactory.createSteadyStateProperty();
                  property = steadyStateProperty;
                }
              }
            }
          }
        }
      }
    }
    if ((property instanceof UnaryProbabilityProperty)) {
      UnaryProbabilityProperty unaryProperty_4 = ((UnaryProbabilityProperty) property);
      unaryProperty_4.setStateFormula(leftStateFormula);
      ITimeConstraint _timeConstraint = this.getTimeConstraint(probabilityProperty);
      unaryProperty_4.setTimeConstraint(_timeConstraint);
      ProbabilityConstraint _probabilityConstraint = probabilityProperty.getProbabilityConstraint();
      boolean _notEquals = (!Objects.equal(_probabilityConstraint, null));
      if (_notEquals) {
        ProbabilityConstraint _probabilityConstraint_1 = probabilityProperty.getProbabilityConstraint();
        Object _doSwitch_1 = this.doSwitch(_probabilityConstraint_1);
        unaryProperty_4.setProbabilityConstraint(((IProbabilityConstraint) _doSwitch_1));
      }
      List<PropertyInitialCondition> _initialConditions = unaryProperty_4.getInitialConditions();
      EList<roadblock.xtext.ibl.ibl.PropertyInitialCondition> _initialConditions_1 = probabilityProperty.getInitialConditions();
      final Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition> _function = new Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition>() {
        public roadblock.xtext.ibl.ibl.PropertyInitialCondition apply(final roadblock.xtext.ibl.ibl.PropertyInitialCondition i) {
          Object _doSwitch = PropertyBuilder.this.doSwitch(i);
          return ((roadblock.xtext.ibl.ibl.PropertyInitialCondition) _doSwitch);
        }
      };
      List<PropertyInitialCondition> _map = ListExtensions.<roadblock.xtext.ibl.ibl.PropertyInitialCondition, PropertyInitialCondition>map(_initialConditions_1, (Function1<? super roadblock.xtext.ibl.ibl.PropertyInitialCondition,? extends PropertyInitialCondition>)_function);
      Iterables.<PropertyInitialCondition>addAll(_initialConditions, _map);
    } else {
      if ((property instanceof BinaryProbabilityProperty)) {
        BinaryProbabilityProperty binaryProperty_2 = ((BinaryProbabilityProperty) property);
        binaryProperty_2.setLeftOperand(leftStateFormula);
        StateFormula _stateFormula2 = probabilityProperty.getStateFormula2();
        Object _doSwitch_2 = this.doSwitch(_stateFormula2);
        binaryProperty_2.setRightOperand(((IStateFormula) _doSwitch_2));
        ITimeConstraint _timeConstraint_1 = this.getTimeConstraint(probabilityProperty);
        binaryProperty_2.setTimeConstraint(_timeConstraint_1);
        ProbabilityConstraint _probabilityConstraint_2 = probabilityProperty.getProbabilityConstraint();
        boolean _notEquals_1 = (!Objects.equal(_probabilityConstraint_2, null));
        if (_notEquals_1) {
          ProbabilityConstraint _probabilityConstraint_3 = probabilityProperty.getProbabilityConstraint();
          Object _doSwitch_3 = this.doSwitch(_probabilityConstraint_3);
          binaryProperty_2.setProbabilityConstraint(((IProbabilityConstraint) _doSwitch_3));
        }
        List<PropertyInitialCondition> _initialConditions_2 = binaryProperty_2.getInitialConditions();
        EList<roadblock.xtext.ibl.ibl.PropertyInitialCondition> _initialConditions_3 = probabilityProperty.getInitialConditions();
        final Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition> _function_1 = new Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition>() {
          public roadblock.xtext.ibl.ibl.PropertyInitialCondition apply(final roadblock.xtext.ibl.ibl.PropertyInitialCondition i) {
            Object _doSwitch = PropertyBuilder.this.doSwitch(i);
            return ((roadblock.xtext.ibl.ibl.PropertyInitialCondition) _doSwitch);
          }
        };
        List<PropertyInitialCondition> _map_1 = ListExtensions.<roadblock.xtext.ibl.ibl.PropertyInitialCondition, PropertyInitialCondition>map(_initialConditions_3, (Function1<? super roadblock.xtext.ibl.ibl.PropertyInitialCondition,? extends PropertyInitialCondition>)_function_1);
        Iterables.<PropertyInitialCondition>addAll(_initialConditions_2, _map_1);
      } else {
        if ((property instanceof SteadyStateProperty)) {
          SteadyStateProperty steadyStateProperty_1 = ((SteadyStateProperty) property);
          steadyStateProperty_1.setStateFormula(leftStateFormula);
          ProbabilityConstraint _probabilityConstraint_4 = probabilityProperty.getProbabilityConstraint();
          boolean _notEquals_2 = (!Objects.equal(_probabilityConstraint_4, null));
          if (_notEquals_2) {
            ProbabilityConstraint _probabilityConstraint_5 = probabilityProperty.getProbabilityConstraint();
            Object _doSwitch_4 = this.doSwitch(_probabilityConstraint_5);
            steadyStateProperty_1.setProbabilityConstraint(((IProbabilityConstraint) _doSwitch_4));
          }
          List<PropertyInitialCondition> _initialConditions_4 = steadyStateProperty_1.getInitialConditions();
          EList<roadblock.xtext.ibl.ibl.PropertyInitialCondition> _initialConditions_5 = probabilityProperty.getInitialConditions();
          final Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition> _function_2 = new Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition>() {
            public roadblock.xtext.ibl.ibl.PropertyInitialCondition apply(final roadblock.xtext.ibl.ibl.PropertyInitialCondition i) {
              Object _doSwitch = PropertyBuilder.this.doSwitch(i);
              return ((roadblock.xtext.ibl.ibl.PropertyInitialCondition) _doSwitch);
            }
          };
          List<PropertyInitialCondition> _map_2 = ListExtensions.<roadblock.xtext.ibl.ibl.PropertyInitialCondition, PropertyInitialCondition>map(_initialConditions_5, (Function1<? super roadblock.xtext.ibl.ibl.PropertyInitialCondition,? extends PropertyInitialCondition>)_function_2);
          Iterables.<PropertyInitialCondition>addAll(_initialConditions_4, _map_2);
        }
      }
    }
    return property;
  }
  
  public Object caseRewardProperty(final RewardProperty rewardProperty) {
    roadblock.emf.ibl.Ibl.RewardProperty property = this.modelFactory.createRewardProperty();
    String _name = rewardProperty.getName();
    property.setVariableName(_name);
    RewardTimeInstant _timeInstant = rewardProperty.getTimeInstant();
    Object _doSwitch = this.doSwitch(_timeInstant);
    property.setTimeConstraint(((TimeInstant) _doSwitch));
    ConcentrationConstraint _concentrationConstraint = rewardProperty.getConcentrationConstraint();
    Object _doSwitch_1 = this.doSwitch(_concentrationConstraint);
    property.setConcentrationConstraint(((roadblock.emf.ibl.Ibl.ConcentrationConstraint) _doSwitch_1));
    List<PropertyInitialCondition> _initialConditions = property.getInitialConditions();
    EList<roadblock.xtext.ibl.ibl.PropertyInitialCondition> _initialConditions_1 = rewardProperty.getInitialConditions();
    final Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition> _function = new Function1<roadblock.xtext.ibl.ibl.PropertyInitialCondition,roadblock.xtext.ibl.ibl.PropertyInitialCondition>() {
      public roadblock.xtext.ibl.ibl.PropertyInitialCondition apply(final roadblock.xtext.ibl.ibl.PropertyInitialCondition i) {
        Object _doSwitch = PropertyBuilder.this.doSwitch(i);
        return ((roadblock.xtext.ibl.ibl.PropertyInitialCondition) _doSwitch);
      }
    };
    List<PropertyInitialCondition> _map = ListExtensions.<roadblock.xtext.ibl.ibl.PropertyInitialCondition, PropertyInitialCondition>map(_initialConditions_1, (Function1<? super roadblock.xtext.ibl.ibl.PropertyInitialCondition,? extends PropertyInitialCondition>)_function);
    Iterables.<PropertyInitialCondition>addAll(_initialConditions, _map);
    return property;
  }
  
  public Object caseTimeInstant(final roadblock.xtext.ibl.ibl.TimeInstant timeInstant) {
    TimeInstant timeConstraint = this.modelFactory.createTimeInstant();
    boolean _isIsEqualTo = timeInstant.isIsEqualTo();
    if (_isIsEqualTo) {
      timeConstraint.setOperator(RelationalOperator.EQ);
    } else {
      boolean _isIsLessThanOrEqual = timeInstant.isIsLessThanOrEqual();
      if (_isIsLessThanOrEqual) {
        timeConstraint.setOperator(RelationalOperator.LE);
      } else {
        boolean _isIsGreaterThanOrEqual = timeInstant.isIsGreaterThanOrEqual();
        if (_isIsGreaterThanOrEqual) {
          timeConstraint.setOperator(RelationalOperator.GE);
        }
      }
    }
    int _timeInstant = timeInstant.getTimeInstant();
    timeConstraint.setValue(_timeInstant);
    String _timeUnit = timeInstant.getTimeUnit();
    TimeUnit _timeUnit_1 = this.getTimeUnit(_timeUnit);
    timeConstraint.setUnit(_timeUnit_1);
    return timeConstraint;
  }
  
  public Object caseTimeInterval(final TimeInterval timeInterval) {
    roadblock.emf.ibl.Ibl.TimeInterval timeConstraint = this.modelFactory.createTimeInterval();
    int _lowerBound = timeInterval.getLowerBound();
    timeConstraint.setLowerBound(_lowerBound);
    int _upperBound = timeInterval.getUpperBound();
    timeConstraint.setUpperBound(_upperBound);
    String _timeUnit = timeInterval.getTimeUnit();
    TimeUnit _timeUnit_1 = this.getTimeUnit(_timeUnit);
    timeConstraint.setUnit(_timeUnit_1);
    return timeConstraint;
  }
  
  public Object caseRewardTimeInstant(final RewardTimeInstant timeInstant) {
    TimeInstant timeConstraint = this.modelFactory.createTimeInstant();
    boolean _isIsEqualTo = timeInstant.isIsEqualTo();
    if (_isIsEqualTo) {
      timeConstraint.setOperator(RelationalOperator.EQ);
    } else {
      boolean _isIsLessThanOrEqual = timeInstant.isIsLessThanOrEqual();
      if (_isIsLessThanOrEqual) {
        timeConstraint.setOperator(RelationalOperator.LE);
      }
    }
    int _timeValue = timeInstant.getTimeValue();
    timeConstraint.setValue(_timeValue);
    String _timeUnit = timeInstant.getTimeUnit();
    TimeUnit _timeUnit_1 = this.getTimeUnit(_timeUnit);
    timeConstraint.setUnit(_timeUnit_1);
    return timeConstraint;
  }
  
  public Object caseStateFormula(final StateFormula stateFormula) {
    IStateFormula formula = ((IStateFormula) null);
    boolean _isIsNegation = stateFormula.isIsNegation();
    if (_isIsNegation) {
      NotStateFormula notStateFormula = this.modelFactory.createNotStateFormula();
      StateFormula _negatedFormula = stateFormula.getNegatedFormula();
      Object _doSwitch = this.doSwitch(_negatedFormula);
      notStateFormula.setNegatedOperand(((IStateFormula) _doSwitch));
      formula = notStateFormula;
    } else {
      boolean _isIsConjunction = stateFormula.isIsConjunction();
      if (_isIsConjunction) {
        BinaryStateFormula binaryStateFormula = this.modelFactory.createBinaryStateFormula();
        binaryStateFormula.setOperator(BooleanOperator.AND);
        StateFormula _leftFormula = stateFormula.getLeftFormula();
        Object _doSwitch_1 = this.doSwitch(_leftFormula);
        binaryStateFormula.setLeftOperand(((IStateFormula) _doSwitch_1));
        StateFormula _rightFormula = stateFormula.getRightFormula();
        Object _doSwitch_2 = this.doSwitch(_rightFormula);
        binaryStateFormula.setRightOperand(((IStateFormula) _doSwitch_2));
        formula = binaryStateFormula;
      } else {
        boolean _isIsDisjunction = stateFormula.isIsDisjunction();
        if (_isIsDisjunction) {
          BinaryStateFormula binaryStateFormula_1 = this.modelFactory.createBinaryStateFormula();
          binaryStateFormula_1.setOperator(BooleanOperator.OR);
          StateFormula _leftFormula_1 = stateFormula.getLeftFormula();
          Object _doSwitch_3 = this.doSwitch(_leftFormula_1);
          binaryStateFormula_1.setLeftOperand(((IStateFormula) _doSwitch_3));
          StateFormula _rightFormula_1 = stateFormula.getRightFormula();
          Object _doSwitch_4 = this.doSwitch(_rightFormula_1);
          binaryStateFormula_1.setRightOperand(((IStateFormula) _doSwitch_4));
          formula = binaryStateFormula_1;
        } else {
          boolean _isIsImplication = stateFormula.isIsImplication();
          if (_isIsImplication) {
            BinaryStateFormula binaryStateFormula_2 = this.modelFactory.createBinaryStateFormula();
            binaryStateFormula_2.setOperator(BooleanOperator.IMPLIES);
            StateFormula _leftFormula_2 = stateFormula.getLeftFormula();
            Object _doSwitch_5 = this.doSwitch(_leftFormula_2);
            binaryStateFormula_2.setLeftOperand(((IStateFormula) _doSwitch_5));
            StateFormula _rightFormula_2 = stateFormula.getRightFormula();
            Object _doSwitch_6 = this.doSwitch(_rightFormula_2);
            binaryStateFormula_2.setRightOperand(((IStateFormula) _doSwitch_6));
            formula = binaryStateFormula_2;
          } else {
            StateExpression _atomicFormula = stateFormula.getAtomicFormula();
            Object _doSwitch_7 = this.doSwitch(_atomicFormula);
            formula = ((IStateFormula) _doSwitch_7);
          }
        }
      }
    }
    return formula;
  }
  
  public Object caseStateExpression(final StateExpression stateExpression) {
    roadblock.emf.ibl.Ibl.StateExpression expression = this.modelFactory.createStateExpression();
    String _name = stateExpression.getName();
    expression.setVariableName(_name);
    String _operator = stateExpression.getOperator();
    RelationalOperator _relationalOperator = this.getRelationalOperator(_operator);
    expression.setOperator(_relationalOperator);
    ConcentrationQuantity _concentrationQuantity = stateExpression.getConcentrationQuantity();
    String _value = _concentrationQuantity.getValue();
    double _parseDouble = Double.parseDouble(_value);
    expression.setQuantity(_parseDouble);
    ConcentrationQuantity _concentrationQuantity_1 = stateExpression.getConcentrationQuantity();
    String _unit = _concentrationQuantity_1.getUnit();
    ConcentrationUnit _concentrationUnit = this.getConcentrationUnit(_unit);
    expression.setUnit(_concentrationUnit);
    return expression;
  }
  
  public Object caseProbabilityConstraint(final ProbabilityConstraint probabilityConstraint) {
    IProbabilityConstraint probability = ((IProbabilityConstraint) null);
    boolean _isHasUnknownProbability = probabilityConstraint.isHasUnknownProbability();
    if (_isHasUnknownProbability) {
      UnknownProbabilityConstraint _createUnknownProbabilityConstraint = this.modelFactory.createUnknownProbabilityConstraint();
      probability = _createUnknownProbabilityConstraint;
    } else {
      ConcreteProbabilityConstraint concreteProbability = this.modelFactory.createConcreteProbabilityConstraint();
      String _operator = probabilityConstraint.getOperator();
      RelationalOperator _relationalOperator = this.getRelationalOperator(_operator);
      concreteProbability.setOperator(_relationalOperator);
      String _probability = probabilityConstraint.getProbability();
      double _parseDouble = Double.parseDouble(_probability);
      concreteProbability.setBound(_parseDouble);
      probability = concreteProbability;
    }
    return probability;
  }
  
  public Object casePropertyInitialCondition(final roadblock.xtext.ibl.ibl.PropertyInitialCondition propertyInitialCondition) {
    PropertyInitialCondition initialCondition = this.modelFactory.createPropertyInitialCondition();
    VariableAssignmentObject _variable = propertyInitialCondition.getVariable();
    Object _doSwitch = this.doSwitch(_variable);
    initialCondition.setVariableName(((String) _doSwitch));
    ConcentrationQuantity _value = propertyInitialCondition.getValue();
    String _value_1 = _value.getValue();
    double _parseDouble = Double.parseDouble(_value_1);
    initialCondition.setValue(_parseDouble);
    ConcentrationQuantity _value_2 = propertyInitialCondition.getValue();
    String _unit = _value_2.getUnit();
    ConcentrationUnit _concentrationUnit = this.getConcentrationUnit(_unit);
    initialCondition.setUnit(_concentrationUnit);
    return initialCondition;
  }
  
  public Object caseConcentrationConstraint(final ConcentrationConstraint concentrationConstraint) {
    roadblock.emf.ibl.Ibl.ConcentrationConstraint concentration = ((roadblock.emf.ibl.Ibl.ConcentrationConstraint) null);
    boolean _isIsUnknown = concentrationConstraint.isIsUnknown();
    boolean _not = (!_isIsUnknown);
    if (_not) {
      roadblock.emf.ibl.Ibl.ConcentrationConstraint _createConcentrationConstraint = this.modelFactory.createConcentrationConstraint();
      concentration = _createConcentrationConstraint;
      String _operator = concentrationConstraint.getOperator();
      RelationalOperator _relationalOperator = this.getRelationalOperator(_operator);
      concentration.setOperator(_relationalOperator);
      String _value = concentrationConstraint.getValue();
      double _parseDouble = Double.parseDouble(_value);
      concentration.setValue(_parseDouble);
      String _unit = concentrationConstraint.getUnit();
      ConcentrationUnit _concentrationUnit = this.getConcentrationUnit(_unit);
      concentration.setUnit(_concentrationUnit);
    }
    return concentration;
  }
  
  private ITimeConstraint getTimeConstraint(final ProbabilityProperty probabilityProperty) {
    ITimeConstraint timeConstraint = ((ITimeConstraint) null);
    roadblock.xtext.ibl.ibl.TimeInstant _timeInstant = probabilityProperty.getTimeInstant();
    boolean _notEquals = (!Objects.equal(_timeInstant, null));
    if (_notEquals) {
      roadblock.xtext.ibl.ibl.TimeInstant _timeInstant_1 = probabilityProperty.getTimeInstant();
      Object _doSwitch = this.doSwitch(_timeInstant_1);
      timeConstraint = ((ITimeConstraint) _doSwitch);
    } else {
      TimeInterval _timeInterval = probabilityProperty.getTimeInterval();
      boolean _notEquals_1 = (!Objects.equal(_timeInterval, null));
      if (_notEquals_1) {
        TimeInterval _timeInterval_1 = probabilityProperty.getTimeInterval();
        Object _doSwitch_1 = this.doSwitch(_timeInterval_1);
        timeConstraint = ((ITimeConstraint) _doSwitch_1);
      }
    }
    return timeConstraint;
  }
  
  private TimeUnit getTimeUnit(final String unit) {
    TimeUnit _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(unit,"s")) {
        _matched=true;
        _switchResult = TimeUnit.SECOND;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"min")) {
        _matched=true;
        _switchResult = TimeUnit.MINUTE;
      }
    }
    return _switchResult;
  }
  
  private RelationalOperator getRelationalOperator(final String operator) {
    RelationalOperator _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(operator,"==")) {
        _matched=true;
        _switchResult = RelationalOperator.EQ;
      }
    }
    if (!_matched) {
      if (Objects.equal(operator,"!=")) {
        _matched=true;
        _switchResult = RelationalOperator.NE;
      }
    }
    if (!_matched) {
      if (Objects.equal(operator,"<")) {
        _matched=true;
        _switchResult = RelationalOperator.LT;
      }
    }
    if (!_matched) {
      if (Objects.equal(operator,">")) {
        _matched=true;
        _switchResult = RelationalOperator.GT;
      }
    }
    if (!_matched) {
      if (Objects.equal(operator,"<=")) {
        _matched=true;
        _switchResult = RelationalOperator.LE;
      }
    }
    if (!_matched) {
      if (Objects.equal(operator,">=")) {
        _matched=true;
        _switchResult = RelationalOperator.GE;
      }
    }
    return _switchResult;
  }
  
  private ConcentrationUnit getConcentrationUnit(final String unit) {
    ConcentrationUnit _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(unit,"M")) {
        _matched=true;
        _switchResult = ConcentrationUnit.M;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"mM")) {
        _matched=true;
        _switchResult = ConcentrationUnit.MM;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"uM")) {
        _matched=true;
        _switchResult = ConcentrationUnit.UM;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"nM")) {
        _matched=true;
        _switchResult = ConcentrationUnit.NM;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"pM")) {
        _matched=true;
        _switchResult = ConcentrationUnit.PM;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"fM")) {
        _matched=true;
        _switchResult = ConcentrationUnit.FM;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"molecule")) {
        _matched=true;
        _switchResult = ConcentrationUnit.MOLECULE;
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,"molecules")) {
        _matched=true;
        _switchResult = ConcentrationUnit.MOLECULE;
      }
    }
    return _switchResult;
  }
}
